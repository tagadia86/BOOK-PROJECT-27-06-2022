/*package fr.dawan.BOOKPROJECT.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.BOOKPROJECT.entities.Book;
import fr.dawan.springboot.dto.ProduitDto;
import fr.dawan.springboot.entities.Produit;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
	@Override
	default <S extends Book> S saveAndFlush(S entity) {
		
		
		
		
		return null;
	}

}

/*
 
     public ProduitDto saveOrUpdate(ProduitDto produitDto) {
        
        
//        Produit tmp = prodRepository.saveAndFlush(modelMapper.map(produitDto, Produit.class));
//        return modelMapper.map(tmp, ProduitDto.class);
    
       Produit pr= prodRepository.saveAndFlush(mapper.fromDto(produitDto));
       return mapper.toDto(pr);
    }
 
 */
