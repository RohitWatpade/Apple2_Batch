package test;
import deo.EmployeeOperations;
public class EmployeeMain {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			deo.EmployeeOperations em= new deo.EmployeeOperations();
			em.mainArray();
			em.displayEmployeeData();
			/*em.addEmployee();
			em.displayEmployeeData();
	*/
		/*	em.updateSalaryEmployeeData();
			em.displayEmployeeData();*/
			
			em.deleteEmployee();
			em.displayEmployeeData();
			
			em.addEmployee();
			em.displayEmployeeData();
			
		//mvc structure	     pojo  test  dao
			
			//model        view      Controller    Adv Java
			//pojo         test         dao        Core
			//employee    empMain     empOp,interface
		}


	}



