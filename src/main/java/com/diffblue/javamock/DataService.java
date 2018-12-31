package com.diffblue.javamock;
import java.util.ArrayList;

public interface DataService {
	String[] retrieveAllStrings();
	byte[] retrieveAllBytes();
	ArrayList<Animals> retrieveAllObjects();
}