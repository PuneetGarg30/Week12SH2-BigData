package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class ScanMethod {
	public static void main(String[] args) throws IOException {

		Configuration conf = HBaseConfiguration.create();
		
		HTable ht = new HTable(conf, "student");
		
	    Scan scan = new Scan();

	    scan.addColumn(Bytes.toBytes("personal_info"), Bytes.toBytes("name"));
	    scan.addColumn(Bytes.toBytes("personal_info"), Bytes.toBytes("age"));
	    scan.addColumn(Bytes.toBytes("personal_info"), Bytes.toBytes("city"));
	    
	    ResultScanner scanner = ht.getScanner(scan);
	    
	    for (Result result = scanner.next(); result != null; result = scanner.next()){

	        System.out.println("Result : " + result); }
	    
	        scanner.close();

	}
}
