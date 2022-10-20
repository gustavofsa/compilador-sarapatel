/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.analysis;

import sarapatel.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseADecVarDecsVarConst(ADecVarDecsVarConst node);
    void caseADecConsDecsVarConst(ADecConsDecsVarConst node);
    void caseADecProcedimentoDecsProcFunc(ADecProcedimentoDecsProcFunc node);
    void caseADecFuncaoDecsProcFunc(ADecFuncaoDecsProcFunc node);
    void caseADecCons(ADecCons node);
    void caseADecVar(ADecVar node);
    void caseAIdIds(AIdIds node);
    void caseAIdAtribuicaoIds(AIdAtribuicaoIds node);
    void caseATipoBaseTipo(ATipoBaseTipo node);
    void caseATipoArrTipo(ATipoArrTipo node);
    void caseATipoInteiroTipoBase(ATipoInteiroTipoBase node);
    void caseATipoBooleanoTipoBase(ATipoBooleanoTipoBase node);
    void caseATipoRealTipoBase(ATipoRealTipoBase node);
    void caseATipoCadeiaTipoBase(ATipoCadeiaTipoBase node);
    void caseAIdAtribuicao(AIdAtribuicao node);
    void caseAArrayComp(AArrayComp node);
    void caseABlocoComandos(ABlocoComandos node);
    void caseADecProcedimento(ADecProcedimento node);
    void caseADecFuncao(ADecFuncao node);
    void caseAParametroSeparadorParametroParametros(AParametroSeparadorParametroParametros node);
    void caseAVazioParametros(AVazioParametros node);
    void caseASeparadorParametro(ASeparadorParametro node);
    void caseAParametro(AParametro node);
    void caseATipoBaseTipoParametro(ATipoBaseTipoParametro node);
    void caseATipoParametroTipoParametro(ATipoParametroTipoParametro node);
    void caseAIdIdExp(AIdIdExp node);
    void caseAExpIdExp(AExpIdExp node);
    void caseAIdValor(AIdValor node);
    void caseAValorValor(AValorValor node);
    void caseAChamadaProcedimento(AChamadaProcedimento node);
    void caseABlocoExpressoes(ABlocoExpressoes node);
    void caseADeclaracaoAbertaComando(ADeclaracaoAbertaComando node);
    void caseADeclaracaoFechadaComando(ADeclaracaoFechadaComando node);
    void caseACondSeDeclAberta(ACondSeDeclAberta node);
    void caseACondSeAbertaDeclAberta(ACondSeAbertaDeclAberta node);
    void caseACondSeSenaoAbertaDeclAberta(ACondSeSenaoAbertaDeclAberta node);
    void caseAEnquantoAbertoDeclAberta(AEnquantoAbertoDeclAberta node);
    void caseATudoMenosSeDeclFechada(ATudoMenosSeDeclFechada node);
    void caseACondSeSenaoFechadaDeclFechada(ACondSeSenaoFechadaDeclFechada node);
    void caseAEnquantoFechadoDeclFechada(AEnquantoFechadoDeclFechada node);
    void caseAOutra1TudoMenosSe(AOutra1TudoMenosSe node);
    void caseAOutra2TudoMenosSe(AOutra2TudoMenosSe node);
    void caseAOutra3TudoMenosSe(AOutra3TudoMenosSe node);
    void caseAArrayCompExp(AArrayCompExp node);
    void caseATernarioExp(ATernarioExp node);
    void caseAOrExp(AOrExp node);
    void caseAAndExp(AAndExp node);
    void caseAIgualExp(AIgualExp node);
    void caseAMaiorIgualExp(AMaiorIgualExp node);
    void caseAMaiorExp(AMaiorExp node);
    void caseAExpSomaSubExp(AExpSomaSubExp node);
    void caseAFatorExpSomaSub(AFatorExpSomaSub node);
    void caseASomaExpSomaSub(ASomaExpSomaSub node);
    void caseAMenosExpSomaSub(AMenosExpSomaSub node);
    void caseATermoFator(ATermoFator node);
    void caseAMultFator(AMultFator node);
    void caseADivFator(ADivFator node);
    void caseAModFator(AModFator node);
    void caseAValorTermo(AValorTermo node);
    void caseAChamadaFuncaoTermo(AChamadaFuncaoTermo node);
    void caseAExpTermo(AExpTermo node);
    void caseABlocoExpTermo(ABlocoExpTermo node);
    void caseAMenosTermoTermo(AMenosTermoTermo node);
    void caseATipagemTermo(ATipagemTermo node);
    void caseAIntTipagem(AIntTipagem node);
    void caseARealTipagem(ARealTipagem node);
    void caseAStringTipagem(AStringTipagem node);
    void caseABoolTipagem(ABoolTipagem node);
    void caseAChamadaFuncaoChamadaFuncao(AChamadaFuncaoChamadaFuncao node);
    void caseAListaExpListaExp(AListaExpListaExp node);
    void caseAListaExpVaziaListaExpVazia(AListaExpVaziaListaExpVazia node);
    void caseASeparadorExpSeparadorExp(ASeparadorExpSeparadorExp node);

    void caseTNumero(TNumero node);
    void caseTDecimal(TDecimal node);
    void caseTBooleano(TBooleano node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTColEsq(TColEsq node);
    void caseTColDir(TColDir node);
    void caseTParEsq(TParEsq node);
    void caseTParDir(TParDir node);
    void caseTSoma(TSoma node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTMaiorQ(TMaiorQ node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTIgual(TIgual node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTNao(TNao node);
    void caseTSeparador(TSeparador node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTProcedPrincipal(TProcedPrincipal node);
    void caseTVar(TVar node);
    void caseTConst(TConst node);
    void caseTTipoInteiro(TTipoInteiro node);
    void caseTTipoReal(TTipoReal node);
    void caseTTipoBooleano(TTipoBooleano node);
    void caseTTipoCadeia(TTipoCadeia node);
    void caseTIniBloco(TIniBloco node);
    void caseTFimBloco(TFimBloco node);
    void caseTEnquanto(TEnquanto node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTFalso(TFalso node);
    void caseTFuncao(TFuncao node);
    void caseTProcedimento(TProcedimento node);
    void caseTTipoArray(TTipoArray node);
    void caseTId(TId node);
    void caseTCadeia(TCadeia node);
    void caseTVazio(TVazio node);
    void caseTComentario(TComentario node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
