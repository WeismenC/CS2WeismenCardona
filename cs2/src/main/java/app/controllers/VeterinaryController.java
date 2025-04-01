package app.controllers;

import java.util.Scanner;

import app.domain.models.Pet;
import app.domain.models.User;
import app.domain.services.AdminService;
import app.domain.services.MedicalRecordService;
import app.domain.services.SalesService;
import app.domain.services.VetService;
import lombok.Getter;

public class VeterinaryController {
    @Getter
    private final AdminService adminService;
    @Getter
    private final VetService vetService;
    @Getter
    private final SalesService salesService;
    @Getter
    private final MedicalRecordService medicalRecordService;
    private final Scanner scanner;

    public VeterinaryController(AdminService adminService, VetService vetService, SalesService salesService, MedicalRecordService medicalRecordService) {
        this.adminService = adminService;
        this.vetService = vetService;
        this.salesService = salesService;
        this.medicalRecordService = medicalRecordService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\nMenú Principal");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Registrar mascota");
            System.out.println("3. Registrar historia clínica");
            System.out.println("4. Generar orden médica");
            System.out.println("5. Generar factura");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> registerUser();
                case 2 -> registerPet();
                case 3 -> registerMedicalRecord();
                case 4 -> createOrder();
                case 5 -> generateInvoice();
                case 6 -> {
                    System.out.println("Saliendo del sistema...");
                    return;
                }
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void registerUser() {
        System.out.println("Ingrese cédula:");
        long idCard = scanner.nextLong();
        System.out.println("Ingrese nombre:");
        String name = scanner.nextLine();
        System.out.println("Ingrese edad:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese rol (Admin/Veterinarian/SalesPerson):");
        String role = scanner.nextLine();
        System.out.println("Ingrese nombre de usuario:");
        String username = scanner.nextLine();
        System.out.println("Ingrese contraseña:");
        String password = scanner.nextLine();

        adminService.registerUser(new User(idCard, name.toCharArray(), age, role, username, password));
        System.out.println("Usuario registrado exitosamente.");
    }

    private void registerPet() {
        System.out.println("Ingrese nombre de la mascota:");
        String name = scanner.nextLine();
        System.out.println("Ingrese cédula del dueño:");
        long ownerId = scanner.nextLong();
        System.out.println("Ingrese edad de la mascota:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese especie:");
        String species = scanner.nextLine();
        System.out.println("Ingrese raza:");
        String breed = scanner.nextLine();
        System.out.println("Ingrese características:");
        long characteristics = scanner.nextLong();
        System.out.println("Ingrese peso:");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        adminService.registerPet(new Pet(0, name, ownerId, characteristics, age, species, breed, weight));
        System.out.println("Mascota registrada exitosamente.");
    }

    private void registerMedicalRecord() {
        System.out.println("Ingrese ID de la mascota:");
        long petId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese motivo de consulta:");
        String reason = scanner.nextLine();
        System.out.println("Ingrese síntomas:");
        String symptoms = scanner.nextLine();

        MedicalRecordService.createMedicalRecord(String.valueOf(petId), reason, symptoms);
        System.out.println("Historia clínica registrada exitosamente.");
    }

    private void createOrder() {
        System.out.println("Ingrese ID de la mascota:");
        long petId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese cédula del dueño:");
        long ownerId = scanner.nextLong();
        System.out.println("Ingrese cédula del veterinario:");
        long vetId = scanner.nextLong();
        System.out.println("Ingrese medicamento:");
        String medicine = scanner.nextLine();
        System.out.println("Ingrese dosis:");
        String dose = scanner.nextLine();

        vetService.createMedicalOrder(petId, ownerId, vetId, medicine, dose);
        System.out.println("Orden médica generada exitosamente.");
    }

    private void generateInvoice() {
        System.out.println("Ingrese ID de la mascota:");
        long petId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese cédula del dueño:");
        long ownerId = scanner.nextLong();
        System.out.println("Ingrese ID de la orden médica:");
        long orderId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese producto:");
        String product = scanner.nextLine();
        System.out.println("Ingrese valor:");
        double price = scanner.nextDouble();
        System.out.println("Ingrese cantidad:");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        salesService.generateInvoice(petId, ownerId, orderId, product, price, quantity);
        System.out.println("Factura generada exitosamente.");
    }

}
