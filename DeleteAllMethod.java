package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.util.Bytes;

public class DeleteAllMethod {
	public static void main(String[] args) throws IOException {

		Configuration conf = HBaseConfiguration.create();
		
		HTable ht = new HTable(conf, "student");
		
	    Delete delete1 = new Delete(Bytes.toBytes("1"));
	    
	    ht.delete(delete1);
	    
	    ht.close();
	    System.out.println("It is deleted Successfully");

	}
}
