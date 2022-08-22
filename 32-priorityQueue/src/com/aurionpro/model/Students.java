package com.aurionpro.model;

public class Students implements Comparable<Students> {
	private int id;
	private int rank;
	private String name;

	public Students(int id, int rank, String name) {
		super();
		this.id = id;
		this.rank = rank;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public int getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Sudents [id=" + id + ", rank=" + rank + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Students st) {
		if (rank == st.rank)
			return 0;
		if (rank > st.rank)
			return 1;
		return -1;
	}
}
