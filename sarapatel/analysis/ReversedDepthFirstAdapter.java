/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.analysis;

import java.util.*;
import node.*;
import sarapatel.node.AArrayComp;
import sarapatel.node.ADecCons;
import sarapatel.node.ADecConsDecs;
import sarapatel.node.ADecVar;
import sarapatel.node.ADecVarDecs;
import sarapatel.node.ADivFator;
import sarapatel.node.AExpIdExp;
import sarapatel.node.AExpTermo;
import sarapatel.node.AFatorExp;
import sarapatel.node.AIdAtribuicao;
import sarapatel.node.AIdAtribuicaoIds;
import sarapatel.node.AIdIdExp;
import sarapatel.node.AIdIds;
import sarapatel.node.AMenosExp;
import sarapatel.node.AModFator;
import sarapatel.node.AMultFator;
import sarapatel.node.ANumeroTermo;
import sarapatel.node.AParametro;
import sarapatel.node.AParametroSeparadorParametro;
import sarapatel.node.AParametroSeparadorParametroSeparadorParametroVazio;
import sarapatel.node.AParametros;
import sarapatel.node.APrograma;
import sarapatel.node.ASeparadorParametro;
import sarapatel.node.ASomaExp;
import sarapatel.node.ATermoFator;
import sarapatel.node.ATipoBaseTipo;
import sarapatel.node.ATipoBaseTipoParametro;
import sarapatel.node.ATipoBooleanoTipoBase;
import sarapatel.node.ATipoCadeiaTipoBase;
import sarapatel.node.ATipoInteiroTipoBase;
import sarapatel.node.ATipoParametroTipoParametro;
import sarapatel.node.ATipoRealTipoBase;
import sarapatel.node.ATipoTipo;
import sarapatel.node.AVazioSeparadorParametroVazio;
import sarapatel.node.Node;
import sarapatel.node.PDecs;
import sarapatel.node.PExp;
import sarapatel.node.PSeparadorParametro;
import sarapatel.node.Start;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPPrograma().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            Collections.reverse(copy);
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDecs> copy = new ArrayList<PDecs>(node.getDecs());
            Collections.reverse(copy);
            for(PDecs e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
    }

    public void inADecVarDecs(ADecVarDecs node)
    {
        defaultIn(node);
    }

    public void outADecVarDecs(ADecVarDecs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVarDecs(ADecVarDecs node)
    {
        inADecVarDecs(node);
        if(node.getDecVar() != null)
        {
            node.getDecVar().apply(this);
        }
        outADecVarDecs(node);
    }

    public void inADecConsDecs(ADecConsDecs node)
    {
        defaultIn(node);
    }

    public void outADecConsDecs(ADecConsDecs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecConsDecs(ADecConsDecs node)
    {
        inADecConsDecs(node);
        if(node.getDecCons() != null)
        {
            node.getDecCons().apply(this);
        }
        outADecConsDecs(node);
    }

    public void inADecCons(ADecCons node)
    {
        defaultIn(node);
    }

    public void outADecCons(ADecCons node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecCons(ADecCons node)
    {
        inADecCons(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getIdAtribuicao() != null)
        {
            node.getIdAtribuicao().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        outADecCons(node);
    }

    public void inADecVar(ADecVar node)
    {
        defaultIn(node);
    }

    public void outADecVar(ADecVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADecVar(ADecVar node)
    {
        inADecVar(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getIds() != null)
        {
            node.getIds().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outADecVar(node);
    }

    public void inAIdIds(AIdIds node)
    {
        defaultIn(node);
    }

    public void outAIdIds(AIdIds node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdIds(AIdIds node)
    {
        inAIdIds(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdIds(node);
    }

    public void inAIdAtribuicaoIds(AIdAtribuicaoIds node)
    {
        defaultIn(node);
    }

    public void outAIdAtribuicaoIds(AIdAtribuicaoIds node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAtribuicaoIds(AIdAtribuicaoIds node)
    {
        inAIdAtribuicaoIds(node);
        if(node.getIdAtribuicao() != null)
        {
            node.getIdAtribuicao().apply(this);
        }
        outAIdAtribuicaoIds(node);
    }

    public void inATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultIn(node);
    }

    public void outATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoBaseTipo(ATipoBaseTipo node)
    {
        inATipoBaseTipo(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outATipoBaseTipo(node);
    }

    public void inATipoTipo(ATipoTipo node)
    {
        defaultIn(node);
    }

    public void outATipoTipo(ATipoTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoTipo(ATipoTipo node)
    {
        inATipoTipo(node);
        if(node.getColDir() != null)
        {
            node.getColDir().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getColEsq() != null)
        {
            node.getColEsq().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outATipoTipo(node);
    }

    public void inATipoInteiroTipoBase(ATipoInteiroTipoBase node)
    {
        defaultIn(node);
    }

    public void outATipoInteiroTipoBase(ATipoInteiroTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoInteiroTipoBase(ATipoInteiroTipoBase node)
    {
        inATipoInteiroTipoBase(node);
        if(node.getTipoInteiro() != null)
        {
            node.getTipoInteiro().apply(this);
        }
        outATipoInteiroTipoBase(node);
    }

    public void inATipoBooleanoTipoBase(ATipoBooleanoTipoBase node)
    {
        defaultIn(node);
    }

    public void outATipoBooleanoTipoBase(ATipoBooleanoTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoBooleanoTipoBase(ATipoBooleanoTipoBase node)
    {
        inATipoBooleanoTipoBase(node);
        if(node.getTipoBooleano() != null)
        {
            node.getTipoBooleano().apply(this);
        }
        outATipoBooleanoTipoBase(node);
    }

    public void inATipoRealTipoBase(ATipoRealTipoBase node)
    {
        defaultIn(node);
    }

    public void outATipoRealTipoBase(ATipoRealTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoRealTipoBase(ATipoRealTipoBase node)
    {
        inATipoRealTipoBase(node);
        if(node.getTipoReal() != null)
        {
            node.getTipoReal().apply(this);
        }
        outATipoRealTipoBase(node);
    }

    public void inATipoCadeiaTipoBase(ATipoCadeiaTipoBase node)
    {
        defaultIn(node);
    }

    public void outATipoCadeiaTipoBase(ATipoCadeiaTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoCadeiaTipoBase(ATipoCadeiaTipoBase node)
    {
        inATipoCadeiaTipoBase(node);
        if(node.getTipoCadeia() != null)
        {
            node.getTipoCadeia().apply(this);
        }
        outATipoCadeiaTipoBase(node);
    }

    public void inAIdAtribuicao(AIdAtribuicao node)
    {
        defaultIn(node);
    }

    public void outAIdAtribuicao(AIdAtribuicao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAtribuicao(AIdAtribuicao node)
    {
        inAIdAtribuicao(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getAtribuicao() != null)
        {
            node.getAtribuicao().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdAtribuicao(node);
    }

    public void inAArrayComp(AArrayComp node)
    {
        defaultIn(node);
    }

    public void outAArrayComp(AArrayComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayComp(AArrayComp node)
    {
        inAArrayComp(node);
        if(node.getColDir() != null)
        {
            node.getColDir().apply(this);
        }
        if(node.getIdExp() != null)
        {
            node.getIdExp().apply(this);
        }
        if(node.getColEsq() != null)
        {
            node.getColEsq().apply(this);
        }
        outAArrayComp(node);
    }

    public void inAParametros(AParametros node)
    {
        defaultIn(node);
    }

    public void outAParametros(AParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametros(AParametros node)
    {
        inAParametros(node);
        if(node.getSeparadorParametroVazio() != null)
        {
            node.getSeparadorParametroVazio().apply(this);
        }
        outAParametros(node);
    }

    public void inAParametroSeparadorParametroSeparadorParametroVazio(AParametroSeparadorParametroSeparadorParametroVazio node)
    {
        defaultIn(node);
    }

    public void outAParametroSeparadorParametroSeparadorParametroVazio(AParametroSeparadorParametroSeparadorParametroVazio node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametroSeparadorParametroSeparadorParametroVazio(AParametroSeparadorParametroSeparadorParametroVazio node)
    {
        inAParametroSeparadorParametroSeparadorParametroVazio(node);
        if(node.getParametroSeparadorParametro() != null)
        {
            node.getParametroSeparadorParametro().apply(this);
        }
        outAParametroSeparadorParametroSeparadorParametroVazio(node);
    }

    public void inAVazioSeparadorParametroVazio(AVazioSeparadorParametroVazio node)
    {
        defaultIn(node);
    }

    public void outAVazioSeparadorParametroVazio(AVazioSeparadorParametroVazio node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVazioSeparadorParametroVazio(AVazioSeparadorParametroVazio node)
    {
        inAVazioSeparadorParametroVazio(node);
        outAVazioSeparadorParametroVazio(node);
    }

    public void inAParametroSeparadorParametro(AParametroSeparadorParametro node)
    {
        defaultIn(node);
    }

    public void outAParametroSeparadorParametro(AParametroSeparadorParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametroSeparadorParametro(AParametroSeparadorParametro node)
    {
        inAParametroSeparadorParametro(node);
        {
            List<PSeparadorParametro> copy = new ArrayList<PSeparadorParametro>(node.getSeparadorParametro());
            Collections.reverse(copy);
            for(PSeparadorParametro e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getParametro() != null)
        {
            node.getParametro().apply(this);
        }
        outAParametroSeparadorParametro(node);
    }

    public void inASeparadorParametro(ASeparadorParametro node)
    {
        defaultIn(node);
    }

    public void outASeparadorParametro(ASeparadorParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeparadorParametro(ASeparadorParametro node)
    {
        inASeparadorParametro(node);
        if(node.getParametro() != null)
        {
            node.getParametro().apply(this);
        }
        if(node.getSeparador() != null)
        {
            node.getSeparador().apply(this);
        }
        outASeparadorParametro(node);
    }

    public void inAParametro(AParametro node)
    {
        defaultIn(node);
    }

    public void outAParametro(AParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        inAParametro(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getTipoParametro() != null)
        {
            node.getTipoParametro().apply(this);
        }
        outAParametro(node);
    }

    public void inATipoBaseTipoParametro(ATipoBaseTipoParametro node)
    {
        defaultIn(node);
    }

    public void outATipoBaseTipoParametro(ATipoBaseTipoParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoBaseTipoParametro(ATipoBaseTipoParametro node)
    {
        inATipoBaseTipoParametro(node);
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outATipoBaseTipoParametro(node);
    }

    public void inATipoParametroTipoParametro(ATipoParametroTipoParametro node)
    {
        defaultIn(node);
    }

    public void outATipoParametroTipoParametro(ATipoParametroTipoParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoParametroTipoParametro(ATipoParametroTipoParametro node)
    {
        inATipoParametroTipoParametro(node);
        if(node.getColDir() != null)
        {
            node.getColDir().apply(this);
        }
        if(node.getColEsq() != null)
        {
            node.getColEsq().apply(this);
        }
        if(node.getTipoParametro() != null)
        {
            node.getTipoParametro().apply(this);
        }
        outATipoParametroTipoParametro(node);
    }

    public void inAIdIdExp(AIdIdExp node)
    {
        defaultIn(node);
    }

    public void outAIdIdExp(AIdIdExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdIdExp(AIdIdExp node)
    {
        inAIdIdExp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdIdExp(node);
    }

    public void inAExpIdExp(AExpIdExp node)
    {
        defaultIn(node);
    }

    public void outAExpIdExp(AExpIdExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpIdExp(AExpIdExp node)
    {
        inAExpIdExp(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpIdExp(node);
    }

    public void inAFatorExp(AFatorExp node)
    {
        defaultIn(node);
    }

    public void outAFatorExp(AFatorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFatorExp(AFatorExp node)
    {
        inAFatorExp(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAFatorExp(node);
    }

    public void inASomaExp(ASomaExp node)
    {
        defaultIn(node);
    }

    public void outASomaExp(ASomaExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExp(ASomaExp node)
    {
        inASomaExp(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        if(node.getSoma() != null)
        {
            node.getSoma().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outASomaExp(node);
    }

    public void inAMenosExp(AMenosExp node)
    {
        defaultIn(node);
    }

    public void outAMenosExp(AMenosExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExp(AMenosExp node)
    {
        inAMenosExp(node);
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMenosExp(node);
    }

    public void inATermoFator(ATermoFator node)
    {
        defaultIn(node);
    }

    public void outATermoFator(ATermoFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermoFator(ATermoFator node)
    {
        inATermoFator(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        outATermoFator(node);
    }

    public void inAMultFator(AMultFator node)
    {
        defaultIn(node);
    }

    public void outAMultFator(AMultFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultFator(AMultFator node)
    {
        inAMultFator(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAMultFator(node);
    }

    public void inADivFator(ADivFator node)
    {
        defaultIn(node);
    }

    public void outADivFator(ADivFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivFator(ADivFator node)
    {
        inADivFator(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outADivFator(node);
    }

    public void inAModFator(AModFator node)
    {
        defaultIn(node);
    }

    public void outAModFator(AModFator node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModFator(AModFator node)
    {
        inAModFator(node);
        if(node.getTermo() != null)
        {
            node.getTermo().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getFator() != null)
        {
            node.getFator().apply(this);
        }
        outAModFator(node);
    }

    public void inANumeroTermo(ANumeroTermo node)
    {
        defaultIn(node);
    }

    public void outANumeroTermo(ANumeroTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroTermo(ANumeroTermo node)
    {
        inANumeroTermo(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outANumeroTermo(node);
    }

    public void inAExpTermo(AExpTermo node)
    {
        defaultIn(node);
    }

    public void outAExpTermo(AExpTermo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpTermo(AExpTermo node)
    {
        inAExpTermo(node);
        if(node.getParDir() != null)
        {
            node.getParDir().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParEsq() != null)
        {
            node.getParEsq().apply(this);
        }
        outAExpTermo(node);
    }
}
