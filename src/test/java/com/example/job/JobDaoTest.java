package com.example.job;

import com.example.job.job.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.format.annotation.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JobDaoTest {
  @Autowired
  private JobDao jobDao;

  @Test
  public void saveTest() {
    Job j = Job.builder().title("작업1").build();
    int result = jobDao.save(j);
    assertEquals(1, result);
  }
  @Test
  public void findAllTest() {
    assertEquals(1, jobDao.findAll().size());
  }

  @Test
  public void findByJnoTest() {
    assertNotNull(jobDao.findByJno(1));
    // assertNotNull(jobDao.findByJno(2));
  }

  @Test
  public void updateTest() {
    int result = jobDao.update("아뭐하지",1);
    assertEquals(1, result);
    // result = jobDao.update("이건뭔데",1);
    // assertEquals(1, result);
  }
  @Test
  public void deleteTest()  {
     int result = jobDao.delete(1);
     assertEquals(1, result);
    // int result = jobDao.delete(0);
    // assertEquals(0, result);

  }
 }
