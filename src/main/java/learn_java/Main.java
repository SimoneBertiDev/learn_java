package learn_java;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        boolean exit = true;
        do {
            System.out.println("Seleziona cosa vuoi fare");
            System.out.println("Indovina, StudioGhibli, Calcolatrice, ESCI");

            String volonta = sc.nextLine();

            switch (volonta) {
                case "Indovina":
                    int randomNum = (int) (Math.random() * 101);
                    //System.out.println(randomNum);


                    int numeroTentativi = 0;
                    int numeroImputato;

                    do {
                        if (numeroTentativi == 0) {
                            System.out.println("Quale numero stai pensando");
                        }
                        numeroImputato = sc.nextInt();
                        numeroTentativi++;
                        if (numeroImputato > randomNum) {
                            System.out.println("il numero inserito e maggiore del numero da trovare");
                        }
                        if (numeroImputato < randomNum) {
                            System.out.println("il numero inserito e minore del numero da trovare");
                        }

                    } while (numeroImputato != randomNum);


                    System.out.println("Complimenti il hai indovinato il nuemro in " + numeroTentativi + " tentativi");
                    break;
                case "StudioGhibli":
                    try {
                        String idPerson = sc.nextLine();
                        sc.close();
                        URL url = new URL("https://ghibliapi.herokuapp.com/people/" + idPerson);
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("GET");
                        conn.connect();

                        int responseCode = conn.getResponseCode();

                        if (responseCode != 200) {
                            throw new Exception(responseCode + " bad request");
                        } else {
                            String inline = "";
                            Scanner scanner = new Scanner(url.openStream());

                            while (scanner.hasNext()) {
                                inline += scanner.nextLine();
                            }
                            String json = inline.replace("gander", "gender");
//                MyPojo[] pojos = objectMapper.readValue(json, MyPojo[].class);

                            ObjectMapper cm = new ObjectMapper();
                            SinglePerson[] id = cm.readValue(json, SinglePerson[].class);
                            var j = id.length;
                            System.out.println(j);
                            for (int i = 0; i < j; i++) {
                                System.out.println(id[i].name);
                                System.out.println(id[i].gender);
                                System.out.println(id[i].age);
                                System.out.println(id[i].eye_color);
                                System.out.println(id[i].hair_color);
                                System.out.println();
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "Calcolatrice":
                    System.out.println("Primo numero");
                    int n1 = sc.nextInt();
                    System.out.println("Secondo numero");
                    int n2 = sc.nextInt();
                    System.out.println("Operando");
                    String operando = sc.next();
                    switch (operando){
                        case "+":
                            System.out.println(n1 + n2);
                            break;
                        case "-":
                            System.out.println(n1 - n2);
                            break;
                        case "*":
                            System.out.println(n1 * n2);
                            break;
                        case "/":
                            System.out.println(n1 / n2);
                            break;
                    }
                    break;
                case "ESCI":
                    exit = false;
                    break;
            }
        } while (exit != false);
        System.out.println("Ciao alla prossima");

        //dichiarare un tipo con un final diventa inmutabile il valore in modo tale di non essere modificato durante lesecuzione
        //String userName = sc.nextLine();
        //int age = sc.nextInt();


    }
}