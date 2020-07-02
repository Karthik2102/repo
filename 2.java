package com.csvread;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class readCSV {


	public static void csvReader() throws IOException{


		System.out.println("Reading Price coloumn name in csv");
		String filelocation="D://Sacramentorealestatetransactions.csv";
		FileWriter writer=writer = new FileWriter("D://output.csv");
		BufferedWriter bwr=bwr = new BufferedWriter(writer);
		bwr.write("Price");
		bwr.write("\n"); 
		try{
			String price="";
			BufferedReader br = new BufferedReader(new FileReader(filelocation));
			CSVParser parser  = CSVFormat.DEFAULT.withDelimiter(',').withHeader().parse(br);
			for( CSVRecord record : parser) {
				price=record.get("price");
				bwr.write(price);
				bwr.write("\n");      
			}
			br.close();
			bwr.close();
			writer.close();

		}
		catch (Exception e) {
			
			System.out.println("Exception in reading and writing file "+ e);
		}

	}
	public static void main(String[] args) throws IOException {
		csvReader();
	}

}
