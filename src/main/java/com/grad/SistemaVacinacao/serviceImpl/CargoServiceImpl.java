//package com.grad.SistemaVacinacao.serviceImpl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.grad.sistemaVacinacao.dao.CargoDao;
//import com.grad.sistemaVacinacao.model.Cargo;
//import com.grad.sistemaVacinacao.service.CargoService;
//
//@Transactional(readOnly = false)
//@Service
//public class CargoServiceImpl implements CargoService {
//
//	@Autowired
//	private CargoDao dao;
//
//	@Override
//	public void salvar(Cargo cargo) {
//		dao.save(cargo);
//	}
//
//	@Override
//	public void editar(Cargo cargo) {
//		dao.update(cargo);
//
//	}
//
//	@Override
//	public void excluir(Long id) {
//		dao.delete(id);
//
//	}
//
//	@Transactional(readOnly = true)
//	@Override
//	public Cargo findById(Long id) {
//		return dao.findById(id);
//	}
//
//	@Transactional(readOnly = true)
//	@Override
//	public List<Cargo> findAll() {
//		return dao.findAll();
//	}
//
//}
