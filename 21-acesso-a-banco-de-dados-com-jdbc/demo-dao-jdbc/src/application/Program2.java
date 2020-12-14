package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentao();

        System.out.println("=== TESTE 1: department findById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TESTE 2: department findAll ===");
        List<Department> list = departmentDao.findAll();

        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("\n=== TESTE 3: department insert ===");
        Department newDepartment = new Department(null, "Musica");
        departmentDao.insert(newDepartment);
        System.out.println("INSERIDO! Novo Id: " + newDepartment.getId());

        System.out.println("\n=== TESTE 4: department update ===");
        department = departmentDao.findById(1);
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Update Completo");

        System.out.println("\n=== TESTE 6: department delete ===");
        System.out.print("Digite o ID que deseja deletar: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completo");

        sc.close();
    }

}
