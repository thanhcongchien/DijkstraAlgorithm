package Dijkstra;

public class DijkstraMain {
	public static void main(String[] args) {
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexE = new Vertex("E");
		
		
		vertexA.addAdjacenciesList(new Edge(11,vertexA,vertexC));
		vertexA.addAdjacenciesList(new Edge(18,vertexA,vertexB));
		vertexC.addAdjacenciesList(new Edge(6,vertexC,vertexB));
		vertexC.addAdjacenciesList(new Edge(13,vertexC,vertexD));
		vertexC.addAdjacenciesList(new Edge(12,vertexC,vertexE));
		vertexB.addAdjacenciesList(new Edge(2,vertexB,vertexD));
		vertexD.addAdjacenciesList(new Edge(7,vertexD,vertexE));
	
		ShortestPaths shortestPath = new ShortestPaths();
		shortestPath.MathshortTestPaths(vertexA);
		
		
		System.out.println("Dijkstra Algorithm");
		System.out.println("======================================");
		
	    System.out.println("Minimum distance from A to E: "+vertexE.getDistance());
	    
		System.out.println("======================================");
		System.out.println("Paths");
		System.out.println("======================================");
		
	
		System.out.println("Shortest Path from A to H: "+shortestPath.getshortestPaths(vertexE));
		
	}
	
}
