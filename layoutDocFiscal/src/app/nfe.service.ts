import { Http } from '@angular/http';
import { Injectable } from '@angular/core';

import { Nfe } from "./shared/nfe.model";

@Injectable()
export class NfeService {

  constructor(private http: Http) {}

  public getNfe():Promise<Nfe[]> {

    return this.http.get("http://localhost:8080/nfe/filter/all")
              .toPromise()
              .then((resposta:any) => resposta.json())
  }

  public getBuscaPeriodoTipo(dataD: String,dataA: String,tipo: String) {
    console.log(`http://localhost:8080/nfe/filter/periodoTipo/${tipo}?dataD=${dataD}&dataA=${dataA}`)
    return this.http.get(`http://localhost:8080/nfe/filter/periodoTipo/${tipo}?dataD=${dataA}&dataA=${dataD}`)
              .toPromise()
              .then((resposta:any) => resposta.json())
  }
}
