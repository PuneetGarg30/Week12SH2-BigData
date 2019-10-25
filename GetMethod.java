package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class GetMethod {
	public static void main(String[] args) throws IOException {

		Configuration conf = HBaseConfiguration.create();
		
		HTable ht = new HTable(conf, "student");
		
	      Get get1 = new Get(Bytes.toBytes("1"));

	      Result result = ht.get(get1);

	      byte [] value = result.getValue(Bytes.toBytes("personal_info"),Bytes.toBytes("name"));

	      byte [] value1 = result.getValue(Bytes.toBytes("personal_info"),Bytes.toBytes("age"));

	      byte [] value2 = result.getValue(Bytes.toBytes("personal_info"),Bytes.toBytes("city"));

	      String name = Bytes.toString(value);
	      String age = Bytes.toString(value1);
	      String city = Bytes.toString(value2);
	      
	      System.out.println("name: " + name + "age: "+ age + " city: " + city);
	}
}
