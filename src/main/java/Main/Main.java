package Main;

import controller.ProjectController;
import java.util.List;
import model.Project;

public class Main {

    public static void main(String[] args) {
        ProjectController projectControler = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("description");
        projectControler.save(project);
        
        project.setName("Novo nome do projeto");
        projectControler.update(project);
        
        List<Project> projects = projectControler.getAll();
        System.out.println("Total de projetos = " + projects.size());
    }
    
}
