package com.anma.repo;

import com.anma.models.db.Page;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PageRepo implements PanacheRepository<Page> {
}
