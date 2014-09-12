/* ========================================================================
 * Copyright 2014 Arquidalgos
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 Arquidalgos

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.Arquidalgos.tumeop.master.persistence.api;

import co.edu.uniandes.csw.Arquidalgos.tumeop.master.persistence.entity.TuMeOpusuariosOpEntity;
import co.edu.uniandes.csw.Arquidalgos.usuario.logic.dto.UsuarioDTO;
import co.edu.uniandes.csw.Arquidalgos.tumeop.master.persistence.entity.TuMeOptiendaOPEntity;
import co.edu.uniandes.csw.Arquidalgos.tienda.logic.dto.TiendaDTO;
import co.edu.uniandes.csw.Arquidalgos.tumeop.master.logic.dto.TuMeOpMasterDTO;
import java.util.List;

public interface _ITuMeOpMasterPersistence {

	public TuMeOpMasterDTO getTuMeOp(Long tumeopId);
	
	
    public TuMeOpusuariosOpEntity createTuMeOpusuariosOpEntity(TuMeOpusuariosOpEntity entity);
    public void deleteTuMeOpusuariosOpEntity(Long tuMeOpId, Long usuariosOpId);
    public List<UsuarioDTO> getTuMeOpusuariosOpEntityList(Long tuMeOpId);
    public TuMeOptiendaOPEntity createTuMeOptiendaOPEntity(TuMeOptiendaOPEntity entity);
    public void deleteTuMeOptiendaOPEntity(Long tuMeOpId, Long tiendaOPId);
    public List<TiendaDTO> getTuMeOptiendaOPEntityList(Long tuMeOpId);
   
  
}