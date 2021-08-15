import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

import java.net.UnknownHostException;

import com.mongodb.DB;
public class Mongo {

	public static void main(String[] args) {
		MongoClient newclient=new MongoClient("localhost",27017);
		System.out.println("Connected");
		@SuppressWarnings("deprecation")
		DB db=newclient.getDB("B4");
		DBCollection col=db.getCollection("shop");
		DBCursor cur=col.find();
		while(cur.hasNext())
		{
			int i=1;
			System.out.println(cur.next());
			i++;
		}
	}

}
