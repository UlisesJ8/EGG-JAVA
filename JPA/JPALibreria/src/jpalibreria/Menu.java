package jpalibreria;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import jpalibreria.Entidades.Autor;
import jpalibreria.Entidades.Cliente;
import jpalibreria.Entidades.Editorial;
import jpalibreria.Entidades.Libro;
import jpalibreria.Entidades.Prestamo;
import static jpalibreria.Entidades.Prestamo_.cliente;
import static jpalibreria.Entidades.Prestamo_.fechaDevolucion;
import jpalibreria.Servicios.AutorService;
import jpalibreria.Servicios.ClienteServicio;
import jpalibreria.Servicios.EditorialService;
import jpalibreria.Servicios.LibroService;
import jpalibreria.Servicios.PrestamoServicio;

public class Menu {

    Scanner reader = new Scanner(System.in);
    AutorService autorservice = new AutorService();
    LibroService libroService = new LibroService();
    EditorialService editorialService = new EditorialService();
    ClienteServicio clienteService = new ClienteServicio();
    PrestamoServicio prestamoService = new PrestamoServicio();
    int op, id;
    String nombre, nombreA, nombreE;
    boolean validar;
    Editorial editorial = new Editorial();
    Autor autor = new Autor();
    Libro libro = new Libro();
    Cliente cliente = new Cliente();
    Prestamo prestamo = new Prestamo();

    public void menu() throws Exception {
        try {
            do {
                System.out.println("--------Menu--------");
                System.out.println("Seleccione una opcion en base a lo que quiera utilizar.");
                System.out.println("1. Libro");
                System.out.println("2. Autor");
                System.out.println("3. Editorial");
                System.out.println("4. Cliente");
                System.out.println("5. Prestamo ");
                System.out.println("6. Alta o baja de entidad");
                System.out.println("7. Salir");
                op = reader.nextInt();
                switch (op) {
                    case 1:
                        MenuLibro();
                        break;
                    case 2:
                        MenuAutor();
                        break;
                    case 3:
                        MenuEditorial();
                        break;
                    case 4:
                        MenuCliente();
                        break;
                    case 5:
                        MenuPrestamo();
                        break;
                    case 6:
                        MenuAltaYBaja();
                        break;
                    case 7:
                        System.out.println("Usted salio del programa.");
                        break;
                    default:
                        System.out.println("Esa opcion no existe");
                        break;
                }

            } while (op != 7);

        } catch (Exception ex) {
            throw ex;
        }

    }

    public void MenuLibro() {
        try {
            System.out.println("------Menu Libro------");
            System.out.println("1. Crear Libro");
            System.out.println("2. Consultar Libro");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Modificar Libro");
            System.out.println("5. Busqueda de libro por titulo ");
            System.out.println("6. Busqueda de libro/s por nombre de Autor");
            System.out.println("7. Busqueda de libro/s por nombre de Editorial");
            op = reader.nextInt();
            switch (op) {
                case 1:
                    validar = true;
                    reader.nextLine();
                    do {
                        System.out.println("Ingrese el nombre del libro:");
                        nombre = reader.nextLine();
                        validar = libroService.validarRepetido(nombre);
                    } while (validar == true);
                    System.out.println("Ingrese el anio del libro:");
                    int anio = reader.nextInt();
                    System.out.println("Ingrese la cantidad de ejemplares:");
                    int ce = reader.nextInt();
                    System.out.println("Ingrese la cantidad de ejemplares prestados:");
                    int EP = reader.nextInt();
                    int ER = ce - EP;

                    do {
                        System.out.println("Ingrese el nombre del autor:");
                        reader.nextLine();
                        nombreA = reader.nextLine();
                        validar = autorservice.validarRepetidoAutor(nombreA);
                    } while (validar == true);
                    autor = new Autor(nombreA);
                    autorservice.crearAutor(autor);

                    do {
                        System.out.println("Ingrese el nombre de la editorial:");
                        nombreE = reader.nextLine();
                        validar = editorialService.validarRepetidoEditorial(nombreE);
                    } while (validar == true);
                    editorial = new Editorial(nombreE);
                    editorialService.crearEditorial(editorial);
                    libro = new Libro(nombre, anio, ER, ER, ER, autor, editorial);
                    libroService.crearLibro(libro);
                    break;
                case 2:
                    System.out.println("Ingrese el isbn del libro que estas buscando: ");
                    long isbn = reader.nextLong();
                    Libro libro1 = libroService.consultarLibro(isbn);
                    if (libro1 == null) {
                        System.out.println("No existe libro con ese isbn");
                    } else {
                        System.out.println(libro1.toString());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el isbn del libro que desea eliminar: ");
                    isbn = reader.nextLong();
                    libro = new Libro();
                    libro1 = libroService.consultarLibro(isbn);
                    if (libro1 == null) {
                        System.out.println("No existe el libro que esta intentando eliminar");
                    } else {
                        libroService.EliminarLibro(isbn);
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el isbn del libro que desea modificar: ");
                    isbn = reader.nextLong();
                    libroService.modificarLibro(isbn);
                    break;
                case 5:

                    System.out.println("Ingrese el titulo del libro que esta buscando: ");
                    reader.nextLine();
                    String nombreL = reader.nextLine();
                    libro = new Libro();
                    libro = libroService.buscarLibroPorTitulo(nombreL);
                    if (libro == null) {
                        System.out.println("No se encuentra ese libro");
                    } else {
                        System.out.println(libro.toString());
                    }
                    break;
                case 6:

                    System.out.println("Ingrese el nombre del autor para buscar los libro/s que tiene");
                    reader.nextLine();
                    nombreA = reader.nextLine();
                    autor = new Autor();
                    autor = autorservice.buscarPorNombre(nombreA);
                    if (autor == null) {
                        System.out.println("No existe ese autor");
                    } else {
                        List<Libro> listaLibrosAutor = libroService.buscarLibrosAutor(autor.getId());
                        if (listaLibrosAutor.isEmpty()) {
                            System.out.println("No hay libros");
                        } else {
                            for (Libro u : listaLibrosAutor) {
                                System.out.println(u.toString());
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Ingrese el nombre de la editorial para buscar los tiene libro/s");
                    reader.nextLine();
                    nombreE = reader.nextLine();
                    editorial = new Editorial();
                    editorial = editorialService.buscarEditorialPorNombre(nombreE);
                    if (editorial == null) {
                        System.out.println("No existe esa editorial");
                    } else {
                        List<Libro> listaLibrosEditorial = libroService.buscarLibrosEditorial(editorial.getId());
                        if (listaLibrosEditorial.isEmpty()) {
                            System.out.println("No hay libros");
                        } else {
                            for (Libro u : listaLibrosEditorial) {
                                System.out.println(u.toString());
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error.");

        }

    }

    public void MenuAutor() {
        try {

            System.out.println("------Menu Autor------");
            System.out.println("1. Crear Autor");
            System.out.println("2. Consultar Autor");
            System.out.println("3. Eliminar Autor");
            System.out.println("4. Modificar Autor");
            System.out.println("5. Buscar Autor por nombre");
            op = reader.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("Ingrese el nombre del autor: ");
                        reader.nextLine();
                        nombreA = reader.nextLine();
                        validar = autorservice.validarRepetidoAutor(nombreA);
                    } while (validar == true);
                    autor = new Autor(nombreA);
                    autorservice.crearAutor(autor);
                    break;
                case 2:
                    System.out.println("Ingrese el id del autor que desea consultar: ");
                    id = reader.nextInt();
                    autor = new Autor();
                    autor = autorservice.consultarAutor(id);
                    if (autor == null) {
                        System.out.println("No existe el autor por el id ingresado");
                    } else {
                        System.out.println(autor.toString());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el id del autor que desee eliminar:");
                    id = reader.nextInt();
                    autor = new Autor();
                    autor = autorservice.consultarAutor(id);
                    if (autor == null) {
                        System.out.println("No existe el autor por el id ingresado para eliminar");
                    } else {
                        System.out.println("Si elimina el autor se eliminara el libro o los libros del autor y la editorial. ");
                        System.out.println("1. SI");
                        System.out.println("2. NO");
                        int eliminar = reader.nextInt();
                        switch (eliminar) {
                            case 1:
                                List<Libro> listaLibros = libroService.buscarLibrosAutor(id);
                                editorialService.EliminarEditorial(listaLibros.get(0).getEditorial().getId());
                                for (Libro u : listaLibros) {
                                    libroService.EliminarLibro(u.getIsbn());
                                }
                                autorservice.EliminarAutor(id);
                                break;
                            case 2:
                                System.out.println("No se borro nada.");
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el id del autor que quiere modificar:");
                    id = reader.nextInt();
                    autorservice.modificarAutor(id);
                    break;

                case 5:
                    System.out.println("Ingrese el nombre del Autor que esta buscando: ");
                    reader.nextLine();
                    nombreA = reader.nextLine();
                    autor = new Autor();
                    autor = autorservice.buscarPorNombre(nombreA);
                    if (autor == null) {
                        System.out.println("No se encuentra ese autor");
                    } else {
                        System.out.println(autor.toString());
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error");

        }

    }

    public void MenuEditorial() {

        try {

            System.out.println("------Menu Editorial------");
            System.out.println("1. Crear Editorial");
            System.out.println("2. Consultar Editorial");
            System.out.println("3. Eliminar Editorial");
            System.out.println("4. Modificar Editorial");
            op = reader.nextInt();
            switch (op) {

                case 1:
                    do {
                        System.out.println("Ingrese nombre de la editorial: ");
                        reader.nextLine();
                        nombreE = reader.nextLine();
                        validar = editorialService.validarRepetidoEditorial(nombreE);
                    } while (validar == true);
                    editorial = new Editorial(nombreE);
                    editorialService.crearEditorial(editorial);
                    break;
                case 2:
                    System.out.println("Ingrese el id de la editorial que desea consultar: ");
                    id = reader.nextInt();
                    editorial = editorialService.consultarEditorial(id);
                    System.out.println(editorial.toString());
                    break;
                case 3:
                    System.out.println("Ingrese el id de la editorial que desee eliminar: ");
                    id = reader.nextInt();
                    editorial = editorialService.consultarEditorial(id);
                    if (editorial == null) {
                        System.out.println("No existe la editorial por el id ingresado para eliminar");
                    } else {
                        System.out.println("Si elimina la editorial se eliminara el libro o los libros y los autores de la editorial. ");
                        System.out.println("1. SI");
                        System.out.println("2. NO");
                        int eliminar = reader.nextInt();
                        switch (eliminar) {
                            case 1:
                                List<Libro> listaLibros = libroService.buscarLibrosEditorial(id);

                                for (Libro u : listaLibros) {
                                    libroService.EliminarLibro(u.getIsbn());
                                }
                                autorservice.EliminarAutor(listaLibros.get(0).getAutor().getId());
                                editorialService.EliminarEditorial(id);
                                break;
                            case 2:
                                System.out.println("No se borro nada.");
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                        }

                    }

                    editorialService.EliminarEditorial(id);
                    break;
                case 4:
                    System.out.println("Ingrese el id de la editorial que desee modificar");
                    id = reader.nextInt();
                    editorialService.modificarEditorial(id);
                    break;
                default:
                    System.out.println("Error. Opcion incorrecta");

            }

        } catch (Exception e) {
            System.out.println("Error.");
        }

    }

    public void MenuCliente() {
        try {
            System.out.println("------Menu Cliente------");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Consultar Cliente ");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Modificar Cliente");
            op = reader.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el DNI:");
                    long dni = reader.nextLong();
                    System.out.println("Ingrese el nombre del cliente:");
                    reader.nextLine();
                    String nombreC = reader.nextLine();
                    System.out.println("Ingrese el apellido del cliente:");
                    String apellidoC = reader.nextLine();
                    System.out.println("Ingrese el telofono del cliente:");
                    String telefono = reader.nextLine();
                    cliente = new Cliente(dni, nombreC, apellidoC, telefono);
                    clienteService.crearCliente(cliente);
                    break;
                case 2:
                    System.out.println("Ingrese el id del cliente: ");
                    id = reader.nextInt();
                    cliente = clienteService.consultarCliente(id);
                    if (cliente == null) {
                        System.out.println("No existe el cliente ingresado");
                    } else {
                        System.out.println(cliente.toString());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el id del cliente que desea eliminar: ");
                    id = reader.nextInt();
                    cliente = clienteService.consultarCliente(id);
                    if (cliente == null) {
                        System.out.println("No existe el cliente ingresado para eliminar");
                    } else {
                        clienteService.EliminarCliente(id);
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el id del cliente que desea modificar: ");
                    id = reader.nextInt();
                    cliente = clienteService.consultarCliente(id);
                    if (cliente == null) {
                        System.out.println("No existe el cliente ingresado para modificar");
                    } else {
                        clienteService.modificarCliente(id);
                    }
                    break;
                default:
                    System.out.println("Error. Opcion incorrecta");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void MenuPrestamo() {
        try {
            System.out.println("------Menu Prestamo------");
            System.out.println("1. Crear Prestamo");
            System.out.println("2. Consultar Prestamo");
            System.out.println("3. Eliminar Prestamo");
            System.out.println("4. Modificar Prestamo");
            System.out.println("5. Ingresar fecha de devolucion");
            System.out.println("6. Todos los prestamos de un cliente");
            op = reader.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese la fecha del prestamo(dia-mes-anio):");
                    int diaP = reader.nextInt();
                    int mesP = reader.nextInt();
                    int anioP = reader.nextInt();
                    Date fechaPrestamo = new Date(anioP, mesP, diaP);
                    do {
                        System.out.println("Ingrese el titulo del libro que se prestara:");
                        reader.nextLine();
                        nombre = reader.nextLine();
                        libro = new Libro();
                        libro = libroService.buscarLibroPorTitulo(nombre);
                        if (libro == null) {
                            System.out.println("El libro ingresado no existe");
                        }
                    } while (libro == null);

                    System.out.println("Ingrese eL nombre del cliente:");
                    String nombreC = reader.nextLine();
                    System.out.println("Ingrese el apellido del cliente:");
                    String apellidoC = reader.nextLine();
                    System.out.println("Ingrese el DNI:");
                    long dni = reader.nextLong();
                    System.out.println("Ingrese el telofono del cliente:");
                    reader.nextLine();
                    String telefono = reader.nextLine();
                    cliente = new Cliente(dni, nombreC, apellidoC, telefono);
                    clienteService.crearCliente(cliente);
                    prestamo = new Prestamo(fechaPrestamo, null, libro, cliente);
                    prestamoService.crearPrestamo(prestamo);
                    break;
                case 2:
                    System.out.println("Ingrese el id del prestamo");
                    id = reader.nextInt();
                    prestamo = prestamoService.consultarPrestamo(id);
                    if (prestamo != null) {
                        System.out.println(prestamo.toString());
                    } else {
                        System.out.println("Error no hay un prestamo con ese id");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el id del prestamo que desea eliminar");
                    id = reader.nextInt();
                    prestamo = prestamoService.consultarPrestamo(id);
                    if (prestamo != null) {
                        prestamoService.EliminarPrestamo(id);
                    } else {
                        System.out.println("Error no hay un prestamo con ese id para eliminar");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el id del prestamo que desea modificar");
                    id = reader.nextInt();
                    prestamoService.modificarPrestamo(id);
                    if (prestamo != null) {
                        prestamoService.modificarPrestamo(id);
                    } else {
                        System.out.println("Error no hay un prestamo con ese id para modificar");
                    }

                    break;
                case 5:
                    Date fechaDevolucion = new Date();
                    System.out.println("Ingrese el id del prestamo: ");
                    id = reader.nextInt();
                    prestamo = prestamoService.consultarPrestamo(id);
                    if (prestamo != null) {
                        do {
                            System.out.println("Ingrese fecha de devolucion (dia-mes-anio)");
                            int diaD = reader.nextInt();
                            int mesD = reader.nextInt();
                            int anioD = reader.nextInt();
                            fechaDevolucion = new Date(anioD, mesD, diaD);
                        } while (prestamo.getFechaPrestamo().after(fechaDevolucion));
                        prestamoService.CargarDevolucion(fechaDevolucion, prestamo);
                        System.out.println("Cargada la fecha de devolucion");
                    } else {
                        System.out.println("Error. El id del prestamo ingresado no existe");
                    }
                case 6:
                    System.out.println("Ingrese el DNI del cliente: ");
                    dni = reader.nextLong();
                    List<Cliente> listaClientes = clienteService.listaClientesDNI(dni);
                    if (listaClientes.isEmpty()) {
                        System.out.println("No hay un cliente con ese DNI");
                    } else {
                        List<Prestamo> listaPrestamos = prestamoService.BuscarTodosLosPrestamos(listaClientes);
                        if (listaPrestamos.isEmpty()) {
                            System.out.println("No hay prestamos para el cliente con ese dni");
                            System.out.println(listaClientes.get(0).toString());
                        } else {
                            
                            for (Prestamo u : listaPrestamos) {
                                System.out.println(u.toString());
                            }

                        }

                    }
                    break;
                default:
                    System.out.println("Error. Opcion incorrecta");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void MenuAltaYBaja() {
        try {
            System.out.println("------Menu Alta Y Baja------");
            System.out.println("1. Dar de baja entidad");
            System.out.println("2. Dar de alta entidad");
            op = reader.nextInt();
            switch (op) {

                case 1:
                    System.out.println("Que entidad desea dar de baja: ");
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    int baja = reader.nextInt();
                    switch (baja) {
                        case 1:
                            editorial = new Editorial();
                            editorial.setAlta(false);
                            break;
                        case 2:
                            autor = new Autor();
                            autor.setAlta(false);
                            break;
                        case 3:
                            libro = new Libro();
                            libro.setAlta(false);
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    break;
                case 2:
                    System.out.println("Que entidad desea dar de alta: ");
                    System.out.println("1. Autor");
                    System.out.println("2. Editorial");
                    System.out.println("3. Libro");
                    int alta = reader.nextInt();
                    switch (alta) {
                        case 1:
                            editorial = new Editorial();
                            editorial.setAlta(true);
                            break;
                        case 2:
                            autor = new Autor();
                            autor.setAlta(true);
                            break;
                        case 3:
                            libro = new Libro();
                            libro.setAlta(true);
                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                    break;
                default:
                    System.out.println("Error. opcion incorrecta");
            }
        } catch (Exception e) {

            System.out.println("Error");

        }

    }

}
