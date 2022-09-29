/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADecFuncao extends PDecFuncao
{
    private TFuncao _funcao_;
    private TDoisPontos _doisPontos_;
    private PTipo _tipo_;
    private TId _id_;
    private TParEsq _parEsq_;
    private PParametros _parametros_;
    private TParDir _parDir_;
    private PExp _exp_;

    public ADecFuncao()
    {
        // Constructor
    }

    public ADecFuncao(
        @SuppressWarnings("hiding") TFuncao _funcao_,
        @SuppressWarnings("hiding") TDoisPontos _doisPontos_,
        @SuppressWarnings("hiding") PTipo _tipo_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TParDir _parDir_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setFuncao(_funcao_);

        setDoisPontos(_doisPontos_);

        setTipo(_tipo_);

        setId(_id_);

        setParEsq(_parEsq_);

        setParametros(_parametros_);

        setParDir(_parDir_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new ADecFuncao(
            cloneNode(this._funcao_),
            cloneNode(this._doisPontos_),
            cloneNode(this._tipo_),
            cloneNode(this._id_),
            cloneNode(this._parEsq_),
            cloneNode(this._parametros_),
            cloneNode(this._parDir_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFuncao(this);
    }

    public TFuncao getFuncao()
    {
        return this._funcao_;
    }

    public void setFuncao(TFuncao node)
    {
        if(this._funcao_ != null)
        {
            this._funcao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcao_ = node;
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

    public PTipo getTipo()
    {
        return this._tipo_;
    }

    public void setTipo(PTipo node)
    {
        if(this._tipo_ != null)
        {
            this._tipo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipo_ = node;
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

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._funcao_)
            + toString(this._doisPontos_)
            + toString(this._tipo_)
            + toString(this._id_)
            + toString(this._parEsq_)
            + toString(this._parametros_)
            + toString(this._parDir_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcao_ == child)
        {
            this._funcao_ = null;
            return;
        }

        if(this._doisPontos_ == child)
        {
            this._doisPontos_ = null;
            return;
        }

        if(this._tipo_ == child)
        {
            this._tipo_ = null;
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

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._funcao_ == oldChild)
        {
            setFuncao((TFuncao) newChild);
            return;
        }

        if(this._doisPontos_ == oldChild)
        {
            setDoisPontos((TDoisPontos) newChild);
            return;
        }

        if(this._tipo_ == oldChild)
        {
            setTipo((PTipo) newChild);
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

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
