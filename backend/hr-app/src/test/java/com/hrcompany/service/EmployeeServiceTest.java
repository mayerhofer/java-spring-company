package com.hrcompany.service;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import java.util.List;

import com.hrcompany.business.Employee;

/**
 * Unit test for EmployeeService class.
 */
public class EmployeeServiceTest 
{
  private EmployeeService eSvc;

  @Before
  public void Initialize() {
    eSvc = new EmployeeService();
  }

  /**
   * Constructor Test :-)
   */
  @Test
  public void constructorTest()
  {
    assertNotNull(eSvc);
  }

  /**
   * Constructor Test :-)
   */
  @Test
  public void getAllTest()
  {
    List<Employee> employees = eSvc.getAll();
    assertNotNull(employees);
    assertEquals(0, employees.size());
  }
}
