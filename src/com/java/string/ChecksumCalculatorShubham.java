package com.java.string;

import java.util.ArrayList;
import java.util.List;

public class ChecksumCalculatorShubham {
	 public static void main(String[] args) {
	        List<Integer> fileBytes = new ArrayList<>();
	        fileBytes.add(3);
	        fileBytes.add(44);
	        fileBytes.add(55);
	        fileBytes.add(66);
	        fileBytes.add(2);
	        fileBytes.add(110);
	        fileBytes.add(220);

	        List<Integer> checksums = calculateChecksums(fileBytes);
	        System.out.println(checksums);  // Output: [165, 74]
	    }

	    public static List<Integer> calculateChecksums(List<Integer> fileBytes) {
	        List<Integer> checksums = new ArrayList<>();

	        int startIndex = 0;
	        while (startIndex < fileBytes.size()) {
	            int chunkSize = fileBytes.get(startIndex); // Get the chunk size from the header
	            int endIndex = startIndex + chunkSize + 1; // Calculate the end index of the chunk (header not included in size)
	            
	            // If chunk size is greater than 0, calculate checksum
	            if (chunkSize > 0) {
	                int checksum = calculateChecksum(fileBytes.subList(startIndex + 1, endIndex)); // Calculate checksum for current chunk
	                checksums.add(checksum);
	            } else {
	                checksums.add(0); // Zero-sized chunk has checksum of 0
	            }

	            startIndex = endIndex; // Move to the next chunk
	        }

	        return checksums;
	    }

	    public static int calculateChecksum(List<Integer> chunk) {
	        int sum = 0;
	        for (int i = 0; i < chunk.size(); i++) {
	            sum += chunk.get(i); // Sum up all bytes in the chunk
	        }
	        return sum % 256; // Keep only the 8 lowest bits
	    }
}
