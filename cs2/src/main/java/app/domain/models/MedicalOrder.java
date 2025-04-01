package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class MedicalOrder {
    private String orderId;
    private String petId;
    private String ownerId;
    private String veterinarianId;
    private String medication;
    private String dosage;
    private LocalDate date;

    public MedicalOrder(String orderId, String petId, String ownerId, String veterinarianId, String medication, String dosage) {
        this.orderId = orderId;
        this.petId = petId;
        this.ownerId = ownerId;
        this.veterinarianId = veterinarianId;
        this.medication = medication;
        this.dosage = dosage;
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Orden Médica #" + orderId +
                "\nMascota ID: " + petId +
                "\nDueño ID: " + ownerId +
                "\nVeterinario ID: " + veterinarianId +
                "\nMedicamento: " + medication +
                "\nDosis: " + dosage +
                "\nFecha: " + date;
    }
}
