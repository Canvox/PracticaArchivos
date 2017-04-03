/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivos2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

/**
 *
 * @author INTEL-COREi7
 */
public class Interfaz extends JFrame implements ActionListener {

    JFrame field;

    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;

    JButton b1;
    
    ImageIcon image;
    JLabel label;

    //JPanel buttonPanel;

    Alumno alumno;
    Universidad u;
    
    ArrayList listaAlumnos;

    public Interfaz() {

        field = new JFrame();
        
        image = new ImageIcon("image.png");
        label = new JLabel();
        
        label.add(image);

        t1 = new JTextField(10);
        t1.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Cedula"), t1.getBorder()));
        //t1.setHorizontalAlignment(JTextField.RIGHT);

        t2 = new JTextField(10);
        t2.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Nombre"), t2.getBorder()));

        t3 = new JTextField(10);
        t3.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Apellido"), t3.getBorder()));

        t4 = new JTextField(10);
        t4.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Telefono"), t4.getBorder()));

        t5 = new JTextField(10);
        t5.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Direccion"), t5.getBorder()));

        t6 = new JTextField(10);
        t6.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("GPA"), t6.getBorder()));

        t7 = new JTextField(10);
        t7.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Matricula"), t7.getBorder()));

        t8 = new JTextField(10);
        t8.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Facultad"), t8.getBorder()));

        t9 = new JTextField(10);
        t9.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Numero de Creditos Aprobados"), t9.getBorder()));

        t10 = new JTextField(10);
        t10.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Carrera"), t10.getBorder()));

       // buttonPanel = new JPanel();
        b1 = new JButton("ADD");
        field.add(b1);

        //field.add(buttonPanel, BorderLayout.CENTER);

        field.add(t1);
        field.add(t2);
        field.add(t3);
        field.add(t4);
        field.add(t5);
        field.add(t6);
        field.add(t7);
        field.add(t8);
        field.add(t9);
        field.add(t10);

        b1.addActionListener(this);

        field.setLayout(new FlowLayout());
        field.setLocationRelativeTo(null);
        field.setTitle("Registro Estudiantes");
        field.setVisible(true);
        field.setSize(500, 500);
        //field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("ADD")) {
            u = new Universidad();
            alumno = new Alumno();

            alumno.setId(t1.getText());
            alumno.setNombre(t2.getText());
            alumno.setApellido(t3.getText());
            alumno.setTelefono(t4.getText());
            alumno.setDireccion(t5.getText());
            alumno.setGPA(t6.getText());
            alumno.setMatricula(t7.getText());
            alumno.setFacultad(t8.getText());
            alumno.setNumcAprobados(t9.getText());
            alumno.setCarrera(t10.getText());

            listaAlumnos = u.getList();
            //ArrayList listaAlumnos = new ArrayList();
            try {
                u.carga();
                listaAlumnos = u.listaAlumnos;
            } catch (CargarArchivoExcepcion ex) {
                System.out.print("");
            }

            listaAlumnos.add(alumno);
           // u.clonar(listaAlumnos);
            u.listaAlumnos = (ArrayList)listaAlumnos.clone();
            JOptionPane.showMessageDialog(field, "Alumno Agregado");

            field.setVisible(false);
            System.out.println("---Lista con Alumno agregado de Interfaz---");
            for (int i = 0; i < listaAlumnos.size(); i++) {
                System.out.println(listaAlumnos.get(i));

            }
        }
    }
    
    /*public ArrayList getLista(){
       return listaAlumnos;
    }*/
}
