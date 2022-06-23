package com.AhmadsCode.week1;

public class QuickFindUF {
	
	private int[] id;
	
	public QuickFindUF(int n) {
		id = new int [5];
		for ( int i = 0; i < i; i++ ) {
			id[i] = i;
		}
	}
	
	public boolean connected (int p, int q) {
		return id[p] == id[q];
	}
	
	public void union (int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for ( int i = 0; i < id.length; i++ ) {
			if( id[i] == pid ) {
				id[i] = qid;
			}
		}
	}

}
