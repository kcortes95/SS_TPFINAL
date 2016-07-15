package ClothModel;

import java.util.*;

public class Particle {
	
	private final int ID;
	Vector3D pos;
	double mass;
	private Set<Particle> neighbours;


	public Particle(int id, double x, double y, double z, double mass) {
		this.ID = id;
		pos = new Vector3D(x, y, z);
		this.mass = mass;
		neighbours = new HashSet<>();
	}

	public void setNeighbour(Particle p) {
		neighbours.add(p);
	}
	
<<<<<<< HEAD
=======


	// FOR TESTING
	public void printNeighbours(){
		for(Particle n: neighbours){
			System.out.println(n.ID);
		}
	}
	
>>>>>>> 4186c81b3628afccf4bb1483e5ba674d95c9815e
	public Set<Particle> getNeighbours() {
		return neighbours;
	}
	
	public int getID() {
		return ID;
	}
	
	public Vector3D getPos() {
		return pos;
	}

	
	public int hashCode(){
		return ID;
	}
	
	public boolean equals(Object other){
		if(other == null)
			return false;
		if(other.getClass() != this.getClass())
			return false;
		Particle o = (Particle)other;
		if(this.ID != o.ID){
			return false;
		}
		return true;
	}
}
