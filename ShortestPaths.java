package Dijkstra;

import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

public class ShortestPaths {
public void MathshortTestPaths(Vertex sourceVertex) {
	sourceVertex.setDistance(0);
	PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
	priorityQueue.add(sourceVertex);
	sourceVertex.setGone(true);
	
	while(!priorityQueue.isEmpty()) {
		Vertex actualVertex = priorityQueue.poll();
		
		for(Edge edge: actualVertex.getAdjacenciesList()) {
			
			Vertex v = edge.getFirst();
			
			if(!v.isGone()) {
				int newDistance = (int) (actualVertex.getDistance() + edge.getLength());
				
				if( newDistance < v.getDistance() ) {
					priorityQueue.remove(v);
					v.setDistance(newDistance);
					v.setPredecessor(actualVertex);
					priorityQueue.add(v);
					
				}
				
			}
		
		}
		actualVertex.setGone(true);
		}
	}

public List<Vertex> getshortestPaths(Vertex Last)
{
	List<Vertex> path = new ArrayList<>();
	for(Vertex vertex = Last; vertex != null; vertex = vertex.getPredecessor()) {
		path.add(vertex);
	}
	Collections.reverse(path);
	return path;
}
}
