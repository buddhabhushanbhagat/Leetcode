package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SongsShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> songs = Arrays.asList("madhubala","dus bahane kar ke le geye dil","mai huu don","heat waves");
		List<String> shuffledSongs = shuffleSongs(songs);
		System.out.println(shuffledSongs);
	}

	private static List<String> shuffleSongs(List<String> songs) {
		// TODO Auto-generated method stub
		List<String> shuffledSongs = new ArrayList<>();
	Collections.shuffle(songs);
	
		
		return songs;
	}

}
