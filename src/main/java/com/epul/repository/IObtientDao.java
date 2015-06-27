package com.epul.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epul.model.Obtient;

/**
 * Created by Pierre on 26/06/2015.
 */
public interface IObtientDao extends JpaRepository<Obtient, Integer> {
        /*@Transactional
        @Modifying
        @Query("INSERT INTO Obtient VALUES(numapprenant = :numapprenant, idjeu= :idjeu, datejour= :datejour, numaction= :numaction, valeurdebut= :valeurdebut, valeurfin= :valeurfin)")
        public void addObtient(@Param("numapprenant") int numapprenant, @Param("idjeu") int idjeu, @Param("datejour") String datejour, @Param("numaction") int numaction, @Param("valeurdebut") int valeurdebut, @Param("valeurfin") int valeurfin);
*/
	   @Query("FROM Obtient WHERE NUMACTION= :numaction ")
	    public List<Obtient> getObtientFromAction(@Param("numaction") int numaction);
	    
	    @Query("FROM Obtient WHERE NUMAPPRENANT= :numapprenant ")
	    public List<Obtient> getObtientFromApprenant(@Param("numapprenant") int numapprenant);
	    
	    @Query("FROM Obtient WHERE IDJEU= :idJeu ")
	    public List<Obtient> getObtientFromJeu(@Param("idJeu") int idJeu);
}
