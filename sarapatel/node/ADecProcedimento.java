/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ADecProcedimento extends PDecProcedimento
{
    private TProcedPrincipal _procedPrincipal_;
    private TProcedimento _procedimento_;
    private TDoisPontos _doisPontos_;
    private TId _id_;
    private TParEsq _parEsq_;
    private PParametros _parametros_;
    private TParDir _parDir_;
    private PComando _comando_;

    public ADecProcedimento()
    {
        // Constructor
    }

    public ADecProcedimento(
        @SuppressWarnings("hiding") TProcedPrincipal _procedPrincipal_,
        @SuppressWarnings("hiding") TProcedimento _procedimento_,
        @SuppressWarnings("hiding") TDoisPontos _doisPontos_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TParDir _parDir_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setProcedPrincipal(_procedPrincipal_);

        setProcedimento(_procedimento_);

        setDoisPontos(_doisPontos_);

        setId(_id_);

        setParEsq(_parEsq_);

        setParametros(_parametros_);

        setParDir(_parDir_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new ADecProcedimento(
            cloneNode(this._procedPrincipal_),
            cloneNode(this._procedimento_),
            cloneNode(this._doisPontos_),
            cloneNode(this._id_),
            cloneNode(this._parEsq_),
            cloneNode(this._parametros_),
            cloneNode(this._parDir_),
            cloneNode(this._comando_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecProcedimento(this);
    }

    public TProcedPrincipal getProcedPrincipal()
    {
        return this._procedPrincipal_;
    }

    public void setProcedPrincipal(TProcedPrincipal node)
    {
        if(this._procedPrincipal_ != null)
        {
            this._procedPrincipal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._procedPrincipal_ = node;
    }

    public TProcedimento getProcedimento()
    {
        return this._procedimento_;
    }

    public void setProcedimento(TProcedimento node)
    {
        if(this._procedimento_ != null)
        {
            this._procedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._procedimento_ = node;
    }

    public TDoisPontos getDoisPontos()
    {
        return this._doisPontos_;
    }

    public void setDoisPontos(TDoisPontos node)
    {
        if(this._doisPontos_ != null)
        {
            this._doisPontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doisPontos_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PParametros getParametros()
    {
        return this._parametros_;
    }

    public void setParametros(PParametros node)
    {
        if(this._parametros_ != null)
        {
            this._parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametros_ = node;
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._procedPrincipal_)
            + toString(this._procedimento_)
            + toString(this._doisPontos_)
            + toString(this._id_)
            + toString(this._parEsq_)
            + toString(this._parametros_)
            + toString(this._parDir_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._procedPrincipal_ == child)
        {
            this._procedPrincipal_ = null;
            return;
        }

        if(this._procedimento_ == child)
        {
            this._procedimento_ = null;
            return;
        }

        if(this._doisPontos_ == child)
        {
            this._doisPontos_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._parametros_ == child)
        {
            this._parametros_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._procedPrincipal_ == oldChild)
        {
            setProcedPrincipal((TProcedPrincipal) newChild);
            return;
        }

        if(this._procedimento_ == oldChild)
        {
            setProcedimento((TProcedimento) newChild);
            return;
        }

        if(this._doisPontos_ == oldChild)
        {
            setDoisPontos((TDoisPontos) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._parametros_ == oldChild)
        {
            setParametros((PParametros) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
