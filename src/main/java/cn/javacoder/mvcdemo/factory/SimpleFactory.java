package cn.javacoder.mvcdemo.factory;

import java.util.ArrayList;
import java.util.List;

import cn.javacoder.mvcdemo.dto.SimpleDto;
import cn.javacoder.mvcdemo.dto.SimpleWrapDto;

public class SimpleFactory {

	public static List<SimpleWrapDto> test() {
		SimpleWrapDto dto = new SimpleWrapDto();
		dto.setComment("sssssssssssssss");
		dto.setGrade("grade 2");
		dto.setName("javacoder.cn");
		dto.setSex('M');
		List<SimpleDto> list = new ArrayList<SimpleDto>();
		dto.setList(list);
		
		list.add(new SimpleDto("Chinese", 100));
		list.add(new SimpleDto("English", 90));
		list.add(new SimpleDto("Math", 80));
		
		List<SimpleWrapDto> result = new ArrayList<SimpleWrapDto>();
		result.add(dto);
		return result;
	}
	
	void ss() {
		net.sf.jasperreports.engine.JREmptyDataSource ss;
		net.sf.jasperreports.engine.JRRewindableDataSource sss;
		net.sf.jasperreports.engine.data.JRBeanCollectionDataSource s;
	}
}
