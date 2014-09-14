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

package co.edu.uniandes.csw.Arquidalgos.bono.service;

import co.edu.uniandes.csw.Arquidalgos.bono.logic.api.IBonoLogicService;
import co.edu.uniandes.csw.Arquidalgos.bono.logic.dto.BonoDTO;
import co.edu.uniandes.csw.Arquidalgos.bono.logic.dto.PrecioDTO;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


public abstract class _BonoService {

	@Inject
	protected IBonoLogicService bonoLogicService;
	
	@POST
	public BonoDTO createBono(BonoDTO bono){
		return bonoLogicService.createBono(bono);
	}
	
	@DELETE
	@Path("{id}")
	public void deleteBono(@PathParam("id") Long id){
		bonoLogicService.deleteBono(id);
	}
	
        @GET
	@Path("/validar/{id}")
	public PrecioDTO validarBono(@PathParam("id") Long id){
		BonoDTO bono = bonoLogicService.getBono(id);
                if(bono==null)
                {
                    PrecioDTO p = new PrecioDTO();
                    p.setValor(-1);
                    return p;
                }
                else
                {
                    PrecioDTO p = new PrecioDTO();
                    p.setValor(bono.getValor());
                    return p;
                }
	}
        
	@GET
	public List<BonoDTO> getBonos(){
		return bonoLogicService.getBonos();
	}
	
	@GET
	@Path("{id}")
	public BonoDTO getBono(@PathParam("id") Long id){
		return bonoLogicService.getBono(id);
	}
	
	@PUT
    @Path("{id}")
	public void updateBono(@PathParam("id") Long id, BonoDTO bono){
		bonoLogicService.updateBono(bono);
	}
	
}