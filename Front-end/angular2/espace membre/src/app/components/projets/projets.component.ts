import { Component, OnInit } from '@angular/core';
import {IdService} from '../../services/id.service';

@Component({
  selector: 'app-projets',
  templateUrl: './projets.component.html',
  styleUrls: ['./projets.component.css']
})
export class ProjetsComponent implements OnInit {

  private projets = [
  "Les modèles d’organisation",
  "Le modèle de l’entrepreneur",
  "Le modèle standard du Project Management Institute (PMI).",
  "PMI promeut une conduite de projet utilisant des outils ",
  "Le modèle séquentiel de gestion de projet. ",
  "Le modèle de l’ingénierie concourante (IC).",
  "Managment de  projets "];
  
  constructor(private idService:IdService) { }

  ngOnInit() {
    if(this.idService.getId() < 10){
      this.projets = this.projets.slice(0,2);
    }
  }
  

}
