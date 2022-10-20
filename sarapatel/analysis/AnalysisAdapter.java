/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.analysis;

import java.util.*;
import sarapatel.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVarDecsVarConst(ADecVarDecsVarConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecConsDecsVarConst(ADecConsDecsVarConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcedimentoDecsProcFunc(ADecProcedimentoDecsProcFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncaoDecsProcFunc(ADecFuncaoDecsProcFunc node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecCons(ADecCons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecVar(ADecVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdIds(AIdIds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtribuicaoIds(AIdAtribuicaoIds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBaseTipo(ATipoBaseTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoArrTipo(ATipoArrTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoInteiroTipoBase(ATipoInteiroTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBooleanoTipoBase(ATipoBooleanoTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoRealTipoBase(ATipoRealTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoCadeiaTipoBase(ATipoCadeiaTipoBase node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdAtribuicao(AIdAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayComp(AArrayComp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoComandos(ABlocoComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecProcedimento(ADecProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADecFuncao(ADecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametroSeparadorParametroParametros(AParametroSeparadorParametroParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVazioParametros(AVazioParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeparadorParametro(ASeparadorParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParametro(AParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoBaseTipoParametro(ATipoBaseTipoParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoParametroTipoParametro(ATipoParametroTipoParametro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdIdExp(AIdIdExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpIdExp(AExpIdExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdValor(AIdValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorValor(AValorValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaProcedimento(AChamadaProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExpressoes(ABlocoExpressoes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoAbertaComando(ADeclaracaoAbertaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclaracaoFechadaComando(ADeclaracaoFechadaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondSeDeclAberta(ACondSeDeclAberta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondSeAbertaDeclAberta(ACondSeAbertaDeclAberta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondSeSenaoAbertaDeclAberta(ACondSeSenaoAbertaDeclAberta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoAbertoDeclAberta(AEnquantoAbertoDeclAberta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATudoMenosSeDeclFechada(ATudoMenosSeDeclFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACondSeSenaoFechadaDeclFechada(ACondSeSenaoFechadaDeclFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoFechadoDeclFechada(AEnquantoFechadoDeclFechada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOutra1TudoMenosSe(AOutra1TudoMenosSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOutra2TudoMenosSe(AOutra2TudoMenosSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOutra3TudoMenosSe(AOutra3TudoMenosSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayCompExp(AArrayCompExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATernarioExp(ATernarioExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExp(AOrExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndExp(AAndExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualExp(AIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualExp(AMaiorIgualExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorExp(AMaiorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpSomaSubExp(AExpSomaSubExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFatorExpSomaSub(AFatorExpSomaSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASomaExpSomaSub(ASomaExpSomaSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosExpSomaSub(AMenosExpSomaSub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermoFator(ATermoFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMultFator(AMultFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivFator(ADivFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAModFator(AModFator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorTermo(AValorTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaFuncaoTermo(AChamadaFuncaoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpTermo(AExpTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABlocoExpTermo(ABlocoExpTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenosTermoTermo(AMenosTermoTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipagemTermo(ATipagemTermo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTipagem(AIntTipagem node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipagem(ARealTipagem node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringTipagem(AStringTipagem node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABoolTipagem(ABoolTipagem node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAChamadaFuncaoChamadaFuncao(AChamadaFuncaoChamadaFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpListaExp(AListaExpListaExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListaExpVaziaListaExpVazia(AListaExpVaziaListaExpVazia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeparadorExpSeparadorExp(ASeparadorExpSeparadorExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDecimal(TDecimal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBooleano(TBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColEsq(TColEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColDir(TColDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParEsq(TParEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParDir(TParDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSoma(TSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorQ(TMaiorQ node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSeparador(TSeparador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProcedPrincipal(TProcedPrincipal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVar(TVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoInteiro(TTipoInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoReal(TTipoReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoBooleano(TTipoBooleano node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoCadeia(TTipoCadeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIniBloco(TIniBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimBloco(TFimBloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdadeiro(TVerdadeiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalso(TFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFuncao(TFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProcedimento(TProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipoArray(TTipoArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCadeia(TCadeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
