/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat8;

import java.util.ArrayList;

/**
 *
 * @author Gréta
 */
public class Test {
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		
		s1.add(1.0);
		s1.add(2.0);
	}
}

class Sample implements RealNumbers{

	private ArrayList<Double> li;
	
	@Override
	public void add(double num) {
		li.add(num);
	}

	@Override
	public double get(int idx) {
		return li.get(idx);
	}

	@Override
	public void delete(int idx) {
		li.remove(idx);
	}

	@Override
	public boolean contains(double num) {
		return li.contains(num);
	}

	@Override
	public int getFirstOccurrence(double num) {
		return li.indexOf(num);
	}

	public Sample() {
		super();
	}
	
}