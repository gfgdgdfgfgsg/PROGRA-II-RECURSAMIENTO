
        // Hacer el atributo estático
        Estático.frase = "Frase modificada"; // Cambia la frase estática

        // Imprimir la frase desde el objeto 1 después del cambio
        objeto1.imprimirFrase(); // Imprime "Frase modificada"
        
        // Paso 7: Imprimir el resultado del método estático
        int resultado = Estático.sumar(5, 10);
        System.out.println("La suma es: " + resultado); // Imprime "La suma es: 15"
    }
}
