package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class PutMethod {
	public static void main(String[] args) throws IOException {
		Configuration conf = HBaseConfiguration.create();
		
		HTable ht = new HTable(conf, "student");

	    Put put1 = new Put(Bytes.toBytes("1")); 
		put1.add(Bytes.toBytes("personal_info"), Bytes.toBytes("name"), Bytes.toBytes("Amit"));
		put1.add(Bytes.toBytes("personal_info"), Bytes.toBytes("age"), Bytes.toBytes("34"));
		put1.add(Bytes.toBytes("personal_info"), Bytes.toBytes("city"), Bytes.toBytes("Delhi"));

		put1.add(Bytes.toBytes("class_info"), Bytes.toBytes("marks"), Bytes.toBytes("76"));
		put1.add(Bytes.toBytes("class_info"), Bytes.toBytes("section"), Bytes.toBytes("B"));
		put1.add(Bytes.toBytes("class_info"), Bytes.toBytes("id"), Bytes.toBytes("132"));
		ht.put(put1);
		
		Put put2 = new Put(Bytes.toBytes("2")); 
		put2.add(Bytes.toBytes("personal_info"), Bytes.toBytes("name"), Bytes.toBytes("Puneet"));
		put2.add(Bytes.toBytes("personal_info"), Bytes.toBytes("age"), Bytes.toBytes("21"));
		put2.add(Bytes.toBytes("personal_info"), Bytes.toBytes("city"), Bytes.toBytes("Banglore"));

		put2.add(Bytes.toBytes("class_info"), Bytes.toBytes("marks"), Bytes.toBytes("90"));
		put2.add(Bytes.toBytes("class_info"), Bytes.toBytes("section"), Bytes.toBytes("B"));
		put2.add(Bytes.toBytes("class_info"), Bytes.toBytes("id"), Bytes.toBytes("170056"));
		ht.put(put2);
		
		Put put3 = new Put(Bytes.toBytes("3")); 
		put3.add(Bytes.toBytes("personal_info"), Bytes.toBytes("name"), Bytes.toBytes("Vaibhav"));
		put3.add(Bytes.toBytes("personal_info"), Bytes.toBytes("age"), Bytes.toBytes("82"));
		put3.add(Bytes.toBytes("personal_info"), Bytes.toBytes("city"), Bytes.toBytes("CHD"));

		put3.add(Bytes.toBytes("class_info"), Bytes.toBytes("marks"), Bytes.toBytes("22"));
		put3.add(Bytes.toBytes("class_info"), Bytes.toBytes("section"), Bytes.toBytes("B"));
		put3.add(Bytes.toBytes("class_info"), Bytes.toBytes("id"), Bytes.toBytes("0987"));
		ht.put(put3);
		
		Put put4 = new Put(Bytes.toBytes("4")); 
		put4.add(Bytes.toBytes("personal_info"), Bytes.toBytes("name"), Bytes.toBytes("Dolly"));
		put4.add(Bytes.toBytes("personal_info"), Bytes.toBytes("age"), Bytes.toBytes("89"));
		put4.add(Bytes.toBytes("personal_info"), Bytes.toBytes("city"), Bytes.toBytes("YNR"));

		put4.add(Bytes.toBytes("class_info"), Bytes.toBytes("marks"), Bytes.toBytes("67"));
		put4.add(Bytes.toBytes("class_info"), Bytes.toBytes("section"), Bytes.toBytes("C"));
		put4.add(Bytes.toBytes("class_info"), Bytes.toBytes("id"), Bytes.toBytes("23456"));
		ht.put(put4);
		
		Put put5 = new Put(Bytes.toBytes("5")); 
		put5.add(Bytes.toBytes("personal_info"), Bytes.toBytes("name"), Bytes.toBytes("Sanchit"));
		put5.add(Bytes.toBytes("personal_info"), Bytes.toBytes("age"), Bytes.toBytes("19"));
		put5.add(Bytes.toBytes("personal_info"), Bytes.toBytes("city"), Bytes.toBytes("Sadhora"));

		put5.add(Bytes.toBytes("class_info"), Bytes.toBytes("marks"), Bytes.toBytes("23"));
		put5.add(Bytes.toBytes("class_info"), Bytes.toBytes("section"), Bytes.toBytes("A"));
		put5.add(Bytes.toBytes("class_info"), Bytes.toBytes("id"), Bytes.toBytes("23456"));
		ht.put(put5);

		}
}
