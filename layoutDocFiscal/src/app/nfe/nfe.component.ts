import { NfeService } from './../nfe.service';
import { Component, OnInit } from '@angular/core';
import { Nfe } from '../shared/nfe.model';

@Component({
  selector: 'app-nfe',
  templateUrl: './nfe.component.html',
  styleUrls: ['./nfe.component.css'],
  providers: [NfeService]
})
export class NfeComponent implements OnInit {

  public paginaAtual = 1;
  private nfe : Nfe[];

  constructor(private nfeService: NfeService) { }

  public buscaPeriodoTipo(dataD: String,dataA: String,tipo: String) {

    this.nfeService.getBuscaPeriodoTipo(dataD,dataA,tipo)
                .then((nfe: Nfe[]) => {

                  this.nfe = nfe;
                });
  }
  ngOnInit() {

    this.nfeService.getNfe()
      .then((nfe: Nfe[]) => {

        this.nfe = nfe;
      });
  }

}
