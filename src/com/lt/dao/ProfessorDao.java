package com.lt.dao;

import com.lt.bean.Professor;
import com.lt.bean.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProfessorDao {
public static Map<String, Professor> professorMap = new HashMap<String,Professor>();
static {
    professorMap.put("nagesh@gmail.com",new Professor(701,"Dr Nageshwar Rao","nagesh@gmail.com","tiger"));
    professorMap.put("raj@gmail.com",new Professor(702,"Dr Raj kumar","raj@gmail.com","manager"));
    professorMap.put("durga@gmail.com",new Professor(703," Durga Reddy","durga@gmail.com","system"));
}

}
