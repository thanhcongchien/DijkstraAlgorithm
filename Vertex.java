package Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> {
	 
	private String name;
	private List<Edge> adjacenciesList;
	private boolean gone;
	private Vertex predecessor;
	private int distance = Integer.MAX_VALUE;
 
	public Vertex(String name) {
		this.name = name;
		this.adjacenciesList = new ArrayList<>();
	}
 
	public void addAdjacenciesList(Edge edge) {
		this.adjacenciesList.add(edge);
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}
 
	public void setAdjacenciesList(List<Edge> adjacenciesList) {
		this.adjacenciesList = adjacenciesList;
	}
 
	public boolean isGone() {
		return gone;
	}
 
	public void setGone(boolean gone) {
		this.gone = gone;
	}
 
	public Vertex getPredecessor() {
		return predecessor;
	}
 
	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}
 
	public int getDistance() {
		return distance;
	}
 
	public void setDistance(int distance) {
		this.distance = distance;
	}
 
	@Override
	public String toString() {
		return this.name;
	}
	
	
 
	@Override
	public int compareTo(Vertex otherVertex) {
		return Integer.compare(this.distance, otherVertex.getDistance());
	}
}