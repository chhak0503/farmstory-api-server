package kr.co.chhak.farmstoryapi.repository;

import kr.co.chhak.farmstoryapi.dto.ArticleDTO;
import kr.co.chhak.farmstoryapi.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    public Page<Article> findByCate(String cate, Pageable pageable);



}