package com.devsuperior.dsdesafio.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdesafio.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		Instant is = Instant.now();

		list.add(new Client(1L, "Vanderson", "123456789-01", 6500.0, is, 2));
		list.add(new Client(2L, "Carlos", "123456789-01", 6800.0, is, 1));
		list.add(new Client(3L, "Nasare", "123456789-01", 6900.0, is, 4));

		return ResponseEntity.ok().body(list);
	}

}
