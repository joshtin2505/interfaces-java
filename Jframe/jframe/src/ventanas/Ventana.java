package ventanas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    
    public Ventana (){

        setTitle("Ventana");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //this.getContentPane().setBackground(Color.GRAY);

        iniciarComponentes();//llamo al metodo
    }

    private void iniciarComponentes (){
        JPanel panel = new JPanel();

        panel.setLayout(null);//Con esto se desactiva el  diseño por defecto de los componentes en el panel
        
        this.getContentPane().add(panel);//Agrego el panel a la ventana
        // ya aqui no es necesario poner esto ----> this.getContentPane()
        panel.setBackground(Color.DARK_GRAY);


        //JLabel
            
            //JLabel etiqueta = new JLabel("Hola");//Etiqueta de texto

            //JLabel etiqueta = new JLabel("Hola!", SwingConstants.CENTER /*Para pocicionar el texto en su contenedor desde le constructor*/); //Instanciacion

            JLabel etiqueta = new JLabel();//Instanciacion

            etiqueta.setText("HOLA");//inicializacion
            
            //Para alinear la posicion horizontal de el texto en su contenedor sin necesidad de hacerlo en su constructor, seria:

            etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

            etiqueta.setBounds(10, 10, 70, 20);//Establese el lugar y eltamaño del contenedor de la etiqueta 

            etiqueta.setForeground(Color.WHITE);//Color de la letra
            etiqueta.setOpaque(true);//Da permiso para que se cambie el color de fondo de la etiqueta
            etiqueta.setBackground(Color.GRAY);//Defines el color de foondo de la etiqueta

            //Fuente

                etiqueta.setFont(new Font("Cascadia Code", Font.BOLD, 20));

            //Etiqueta Tipo Imagen
            panel.add(etiqueta);//Añado la etiqueta al panel
            
    }
}
