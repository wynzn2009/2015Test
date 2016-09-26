package com.prisbox.monitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MonitorAnalysis {
	private Map<MonitorId,List<Monitor>> map = new HashMap<MonitorId,List<Monitor>>();
	public MonitorAnalysis(List<Monitor> monitorList,List<MonitorEnum> enumNames){
		if(null!=monitorList){
			for(Monitor m : monitorList){
				MonitorId id = new MonitorId(m, enumNames);
				if(!map.containsKey(id)){
					map.put(id, new ArrayList<Monitor>());
				}
				map.get(id).add(m);
			}
		}
	}
	
	public List<Monitor> analysis(){
		Set<MonitorId> set = map.keySet();
		Iterator<MonitorId> ite = set.iterator();
		List<Monitor> list = new ArrayList<Monitor>();
		while(ite.hasNext()){
			Monitor m = new Monitor();
			List<Monitor> monitorList = map.get(ite.next());
			
			for(Monitor mon : monitorList){
				m.setTrcount(m.getTrcount()+mon.getTrcount());
				if(mon.getMax()>m.getMax()){
					m.setMax(mon.getMax());
					m.setMaxTime(mon.getMaxTime());
				}
				if(mon.getMin()<m.getMin()){
					m.setMin(mon.getMin());
					m.setMinTime(mon.getMinTime());
				}
				m.setAvr(m.getAvr()+ mon.getAvr()*mon.getTrcount());
			}
			m.setAvr(m.getAvr()/m.getTrcount());
		}
		return null;
	}
	
}
