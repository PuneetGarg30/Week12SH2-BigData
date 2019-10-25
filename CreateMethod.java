package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class CreateMethod {

	public static void main(String[] args) throws IOException, MasterNotRunningException  {
	Configuration conf = HBaseConfiguration.create();
	
	HBaseAdmin admin = new HBaseAdmin(conf);
	
    HTableDescriptor tableDescriptor = new
    HTableDescriptor(TableName.valueOf("student"));

    // Adding column families to table descriptor
    tableDescriptor.addFamily(new HColumnDescriptor("personal_info"));
    tableDescriptor.addFamily(new HColumnDescriptor("class_info"));

    // Execute the table through admin
    admin.createTable(tableDescriptor);
	}
}
