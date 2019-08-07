package lt.bit.MavenProject.first;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {

	public static void main(String[] args) throws JsonProcessingException {

		Shop shop = new Shop();
		shop.name = "Untitled";
		shop.address = "Under a bridge";
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(shop);
		System.out.println(json);

	}

}
