package controller;

import Metamodell.*;
import Metamodell.impl.AreaImpl;
import Metamodell.impl.MetamodellFactoryImpl;

import org.eclipse.emf.common.util.EList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Controller<E> {
	
	
	public void computeDegree(Edge e) {
		EList facets = e.getF();
		if(facets.size() == 2) {
			Facet f1 = (Facet) facets.get(0);
			Facet f2 = (Facet) facets.get(1);
			
			double scalar = f1.getNormal().getX() * f2.getNormal().getX() + 
							f1.getNormal().getY() * f2.getNormal().getY() + 
							f1.getNormal().getZ() * f2.getNormal().getZ();
			double mult =  Math.sqrt(f1.getNormal().getX()*f1.getNormal().getX() +
						   f1.getNormal().getY()*f1.getNormal().getY() +
						   f1.getNormal().getZ()*f1.getNormal().getZ())*
						   Math.sqrt(f2.getNormal().getX()*f2.getNormal().getX() +
						   f2.getNormal().getY()*f2.getNormal().getY() +
						   f2.getNormal().getZ()*f2.getNormal().getZ());
							
			
			e.setDegree(Math.acos(scalar/mult));
		}
		
		
		
	}
	
	public void createAreas(Solid s) {
		
		Queue<Facet> q = (Queue<Facet>) s.getFacets();
		Queue<Facet> queue = new LinkedList<Facet>();
		ArrayList<Area> areas = new ArrayList<Area>();
		for(Facet f: q)
		{
			AreaImpl a = (AreaImpl) MetamodellFactoryImpl.init().createArea();
			q.remove(f);
			queue.add(f);
			for(Facet fac : queue) 
			{	
				a.eSet(0, fac);
				for(Edge e: fac.getEdges()) 
				{
					if (e.getDegree() == 0) 
					{
						queue.add(e.getF().get(0));
						queue.add(e.getF().get(0));
						
					}
					
				}
				
			
			}
			queue.clear();
			
		}
	}
	

}


