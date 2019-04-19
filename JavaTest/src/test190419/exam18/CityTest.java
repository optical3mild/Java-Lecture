package test190419.exam18;

import java.util.List;


public class CityTest {

	public static void main(String[] args) {
		CityDAO cDao = new CityDAO();
		
		List<CityDTO> cityList = cDao.selectAll();
		for(CityDTO city : cityList) {
			System.out.println(city.toString());
		}
		
		cDao.close();
	}

}
