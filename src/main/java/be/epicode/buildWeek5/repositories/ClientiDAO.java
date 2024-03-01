package be.epicode.buildWeek5.repositories;

import be.epicode.buildWeek5.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientiDAO extends JpaRepository<Cliente, UUID> {
//    List<Customer> findAllByOrderByNameContact(String nameContact);
//
//    @Query("SELECT c FROM Customer c ORDER BY c.annualTurnover DESC")
//    List<Customer> findAllOrderByAnnualTurnoverDesc(int annualTurnover);
//
//    List<Customer> findAllByOrderBySertionDate(LocalDate sertionDate);
//
//    List<Customer> findAllByOrderByDateLastContact(LocalDate dateLastContact);
//
//    @Query("SELECT c FROM Customer c WHERE c.annualTurnover >= :minAnnualTurnover")
//    List<Customer> findByAnnualTurnover(@Param("minAnnualTurnover") int minAnnualTurnover);
//
//    @Query("SELECT c FROM Customer c WHERE c.sertionDate >= :sertionDate")
//    List<Customer> findBySertionDate(@Param("sertionDate") LocalDate sertionDate);
//
//    @Query("SELECT c FROM Customer c WHERE c.dateLastContact >= :dateLastContact")
//    List<Customer> findByDateLastContact(@Param("dateLastContact") LocalDate dateLastContact);
//
//    @Query("SELECT c FROM Customer c WHERE c.businessName LIKE %:businessName%")
//    List<Customer> findByBusinessName(@Param("businessName") String businessName);





}