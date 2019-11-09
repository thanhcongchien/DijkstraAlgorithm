package Dijkstra;

public class Edge {
	private Vertex First;
	private Vertex Last;
	private int length;
	
public  Edge(int length, Vertex Last, Vertex First) {
	this.First = First;
	this.Last = Last;
	this.length = length;
}

public Vertex getFirst() {
	return First;
}

public void setFirst(Vertex First) {
	this.First = First;
}

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public Vertex getLast() {
	return Last;
}

public void setLast(Vertex Last) {
	this.Last = Last;
}

}
