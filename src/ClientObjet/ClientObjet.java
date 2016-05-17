package ClientObjet;

import communication.answers.AddProjectAnswer;
import communication.data.Project;
import communication.requests.AddProjectRequest;

import java.io.*;
import java.net.*;

public class ClientObjet {

    public static void main(String[] arg) {
        try {
           // communication.data.Project project = new Project("Titre", "Java, XML", "Dudule", "dudu@le.ru");
            //AddProjectRequest addProjectRequest = new AddProjectRequest(project);

            Socket socketConnection = new Socket("192.168.43.241", 8080);

            Test test = new Test();
            ObjectOutputStream clientOutputStream = new
                    ObjectOutputStream(socketConnection.getOutputStream());
            ObjectInputStream clientInputStream = new
                    ObjectInputStream(socketConnection.getInputStream());

           //clientOutputStream.writeObject(addProjectRequest);
            clientOutputStream.writeObject(test);

            AddProjectAnswer ans;
           ans= (AddProjectAnswer) clientInputStream.readObject();

            System.out.println("Answer :"+ans.toString());

            clientOutputStream.close();
            clientInputStream.close();

        } catch (Exception e) {System.out.println(e); }
    }
}