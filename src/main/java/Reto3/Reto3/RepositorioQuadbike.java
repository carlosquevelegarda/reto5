/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carlos Humberto Quevedo Legarda 
 */

@Repository
public class RepositorioQuadbike {
     @Autowired
     private InterfaceQuadbike crud;

     public List<Quadbike> getAll(){
        return (List<Quadbike>) crud.findAll();
     }

     public Optional<Quadbike> getQuadbike(int id){
        return crud.findById(id);
     }

     public Quadbike save(Quadbike quadbike){
        return crud.save(quadbike);
     }
     public void delete(Quadbike quadbike){
        crud.delete(quadbike);
     }
}
